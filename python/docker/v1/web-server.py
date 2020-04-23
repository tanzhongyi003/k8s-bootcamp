import tornado.ioloop
import tornado.web
import socket


class MainHandler(tornado.web.RequestHandler):
    def get(self):
        self.write("Hello World v1 on " + socket.gethostname())


def make_app():
    return tornado.web.Application([
        (r"/", MainHandler),
    ])


if __name__ == "__main__":
    app = make_app()
    app.listen(8080)
    tornado.ioloop.IOLoop.current().start()



