
import java.util.ArrayList;

import java.util.List;

import java.util.stream.Stream;

class Product{

  int id;

  String name;

  float price;

  public Product(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class Q3 {

  public static void main(String[] args) {

    List<Product> list=new ArrayList<Product>();

    

    list.add(new Product(3,"Iphone 6S",65000f));

    list.add(new Product(2,"Sony Xperia",25000f));

    list.add(new Product(1,"Redmi4 ",26000f));

    

    // using lambda to filter data

    Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

    // using lambda to iterate through collection

    filtered_data.forEach(

        product -> System.out.println(product.id+" "+product.name+": "+product.price)

    );

  }

}





