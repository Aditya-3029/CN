import socket



def main():
    host = '127.0.0.1'
    port = 12345

    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((host, port))

    # msg = "hello from client"
    username=input("ENTER NAME: ")
    s.send(username.encode())
    while True:
        # s.send(msg.encode('ascii'))
        # data = s.recv(1024)
        # print('Received from server:', data.decode('ascii'))

        ans = input('Do you want to continue (y/n): ')
        if ans.lower() != 'y':
            break
        else :
            mssg=input("Enter mssg:  ")
            s.send(mssg.encode())
    s.close()

if __name__ == '__main__':
    main()