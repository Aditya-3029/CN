import socket
from _thread import start_new_thread
import threading

lock = threading.Lock()

client={}

def handle_client(c,addr):

    client[c]=c.recv(1024).decode();
    print(client[c]+" Joined the group")

    while True:
        data = c.recv(1024).decode()
        if not data:
            print("")
            break
        print(client[c]+": "+data)
    print(client[c]+" Left the group")        
    c.close()

def main():
    host = ''
    port = 12345
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.bind((host, port))
    s.listen(5)
    print("Server running on port", port)

    while True:
        c, addr = s.accept()
        with lock:
            # print('Connected to:', addr[0], ':', addr[1])
            start_new_thread(handle_client, (c,addr))

if __name__ == '__main__':
    main()