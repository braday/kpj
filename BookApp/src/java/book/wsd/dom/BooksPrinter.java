/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package book.wsd.dom;
//
//import java.io.*;
//import java.util.*;
//import javax.xml.parsers.*;
//import org.w3c.dom.*;
//import org.xml.sax.*;
//
//public class BooksPrinter {
//
//    public static final Printer name = new NamePrinter();
//    public static final Printer plain = new PlainPrinter();
//    public static final Printer xml = new XMLPrinter();
//    public static final Printer html = new HTMLPrinter();
//    static File file = new File("web/WEB-INF/books.xml");
//    static String path = file.getAbsolutePath();
//
//    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Select an output mode:");
//        System.out.println("1: name");
//        System.out.println("2: plain");
//        System.out.println("3: xml");
//        System.out.println("4: html");
//        System.out.print("enter choice: ");
//        int mode = keyboard.nextInt();
//        switch (mode) {
//            case 1:
//                name.print("web/WEB-INF/books.xml", out);
//                break;
//            case 2:
//                plain.print("web/WEB-INF/books.xml", out);
//                break;
//            case 3:
//                xml.print(path, out);
//                break;
//            case 4:
//                html.print("web/WEB-INF/books.xml", out);
//                break;
//        }
//    }
//
//    public static abstract class Printer {
//
//        public abstract void print(Node node, PrintWriter out);
//
//        public void print(String filePath, Writer out) throws ParserConfigurationException, SAXException, IOException {
//            print(filePath, new PrintWriter(out, true));
//        }
//
//        public void print(String filePath, PrintWriter out) throws ParserConfigurationException, SAXException, IOException {
//            FileInputStream in = new FileInputStream(filePath);
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(in);
//            Element root = document.getDocumentElement();
//            print(root, out);
//            out.flush();
//        }
//    }
//
//}
