package CourseJavaSE.DaoStructure;

import CourseJavaSE.DaoStructure.daos.ProductDao;

public class MainClass {

    public static void main(String[] args) throws Exception {

        ProductDao product = new ProductDao();
//        product.save(new Products("cpu",12.33));
//        product.save(new Products("ram",34.65));
//          product.save(new Products("HDD",54.44));

//        for(Products pro: product.getAll()){
//            System.out.println(pro);
//        }

//        System.out.println(product.search(3));
//          product.update(new Products(2,"motherboard",56.54));

//        product.delete(new Products(5,"HDD",54.44));

          product.deleteByCode(4);


//        CustomerDao customer = new CustomerDao();
//        customer.save(new Customer("Ali","bahrami","09195543223"));
//        customer.save(new Customer("reza","ahmadi","09123343432"));
//        customer.save(new Customer("soheil","rahmani","0913453123"));
//        customer.save(new Customer("hamed","komeili","09123343565"));
//        customer.save(new Customer("darya","joranchi","09124352314"));

//        for (Customer custom: customer.getAll()){
//            System.out.println(custom);
//        }

//        customer.delete(5);

//        for (Customer custom: customer.getAll()){
//            System.out.println(custom);
//        }

//        System.out.println(customer.search(1));
    }
}
