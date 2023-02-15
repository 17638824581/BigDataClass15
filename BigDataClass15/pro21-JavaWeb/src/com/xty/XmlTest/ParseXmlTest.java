package com.xty.XmlTest;

import com.xty.beans.Book;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试如何解析 XML 文档
 * @author Mr.yu
 * @date 2023/2/15 11:12
 */
public class ParseXmlTest {
    public static void main(String[] args) throws DocumentException {
        // 如何使用 dom4j 解析 XML 文件

        // 1. 按照 XML 文件的格式，编写实体类（Bean类）

        // 2. 创建 SxaReader 对象，并读取 xml 文件，获得 document 对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("C:\\Users\\XTY\\Desktop\\mytest.xml");

        // 3. 通过 document 获取 根元素（book标签） ，
        Element rootElement = document.getRootElement();

        // 再通过 根元素 拿到它下面所有的 book 元素
        List<Element> books = rootElement.elements("book");

        // result 中保存解析结果
        ArrayList<Book> result = new ArrayList<>();

        // 遍历books 解析每一个book的内容
        for (int i = 0; i < books.size(); i++) {
            Element book = books.get(i);

            String name = book.elementText("name");
            String author = book.elementText("author");
            String price = book.elementText("price");
            String count = book.elementText("count");

            // 在遍历的时候，将每本 book 构建为 Book 对象
            Book b = new Book(name,author,Double.parseDouble(price),Integer.parseInt(count));
            // 将每次解析得到的 Book 对象存储起来
            result.add(b);
        }

        System.out.println(result);

    }
}
