package book.wsd.dom;

import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class BooksPrinter {

    public static final Printer name = new NamePrinter();
    public static final Printer plain = new PlainPrinter();
    public static final Printer xml = new XMLPrinter();
    public static final Printer html = new HTMLPrinter();
    static File file = new File("web/WEB-INF/books.xml");
    static String path = file.getAbsolutePath();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Select an output mode:");
        System.out.println("1: name");
        System.out.println("2: plain");
        System.out.println("3: xml");
        System.out.println("4: html");
        System.out.print("enter choice: ");
        int mode = keyboard.nextInt();
        switch (mode) {
            case 1:
                name.print("web/WEB-INF/books.xml", out);
                break;
            case 2:
                plain.print("web/WEB-INF/books.xml", out);
                break;
            case 3:
                xml.print(path, out);
                break;
            case 4:
                html.print("web/WEB-INF/books.xml", out);
                break;
        }
    }

    public static abstract class Printer {

        public abstract void print(Node node, PrintWriter out);

        public void print(String filePath, Writer out) throws ParserConfigurationException, SAXException, IOException {
            print(filePath, new PrintWriter(out, true));
        }

        public void print(String filePath, PrintWriter out) throws ParserConfigurationException, SAXException, IOException {
            FileInputStream in = new FileInputStream(filePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(in);
            Element root = document.getDocumentElement();
            print(root, out);
            out.flush();
        }
    }

    public static class NamePrinter extends Printer {
        // The "node" parameter corresponds to the <students> node
        // Use "out" to print out the answer

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            Element root = (Element) node;
            Element book = (Element) root.getElementsByTagName("book").item(1);
            Element name = (Element) book.getElementsByTagName("author").item(0);
            System.out.println("The first student is " + name.getFirstChild().getNodeValue());
            // Here is some sample code to start with. This refers to
            // the second child of <students>. The first child item(0) actually
            // refers to the text node "\n\t" because there is a newline and
            // TAB character before the first <student>
            //out.println("The first student node: " + node.getChildNodes().item(1));
        }
    }

    public static class PlainPrinter extends Printer {

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();

            switch (type) {
                case Node.ELEMENT_NODE:
                    out.print(name);
                    NodeList children = node.getChildNodes();
                    for (int i = 0; i < children.getLength(); i++) {
                        Node child = children.item(i);
                        print(child, out);
                    }
                    break;
                case Node.TEXT_NODE:
                    out.print(value);
                    break;
            }
        }
    }

    public static class XMLPrinter extends Printer {

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();
            switch (type) {
                case Node.ELEMENT_NODE:
                    out.print("<" + name + ">");
                    NodeList children = node.getChildNodes();
                    for (int i = 0; i < children.getLength(); i++) {
                        Node child = children.item(i);
                        print(child, out);
                    }
                    out.print("</" + name + ">");
                    break;
                case Node.TEXT_NODE:
                    out.print(value);
                    break;
            }
        }
    }

    public static class HTMLPrinter extends Printer {

        public void print(Node node, PrintWriter out) {
            // INSERT YOUR CODE HERE
            int type = node.getNodeType();
            String name = node.getNodeName();
            String value = node.getNodeValue();
            switch (type) {
                case Node.ELEMENT_NODE:
                    if (name.equals("books")) {
                        name = "table";
                    } else if (name.equals("book")) {
                        name = "tr";
                    } else {
                        name = "td width=\"30%\"";
                    }

                    out.print("<" + name + ">");
                    if (name.equals("table")) {
                        out.print("<hr>");
                        out.print("Book List:");
                        out.print("\n<tr><td>Book ID</td><td>Title</td><td>Author</td><td>Category</td><td>Qty</td></tr>");
                        out.print("<hr>");
                    }
                    NodeList children = node.getChildNodes();
                    for (int i = 0; i < children.getLength(); i++) {
                        Node child = children.item(i);
                        print(child, out);
                    }
                    out.print("</" + name + ">");
                    break;
                case Node.TEXT_NODE:
                    out.print(value);
                    break;
            }
        }
    }

}
