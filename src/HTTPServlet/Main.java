package HTTPServlet;

class Main{
    public static void main(String[] args) {
        Server server = new Server();

        System.out.println(server.getServletInfo());
    }
}
