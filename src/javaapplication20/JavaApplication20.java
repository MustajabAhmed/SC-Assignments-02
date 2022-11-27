package javaapplication20;

abstract class Guest
{
    abstract public void view_menu();
}

class Admin extends Guest
{
    private int id;
    private char name;
    Product p = new Product();
    
    public Admin()
    {
        id = 0;
        name = 0;
    }
    
    public Admin(int id, char name)
    {
        this.id = id;
        this.name = name;
    }
    
    public void view_menu()
    {
        System.out.println("View Menu Function of Admin Class");
    }
    
    public void view_food()
    {
        System.out.println("View Food Function of Admin Class");
    }
    
    public void add_menu()
    {
        System.out.println("Add Menu Function of Admin Class");
    }
    
    public void add_food(char name, char category, char sub_category)
    {
        p.name = name;
        p.category = category;
        p.sub_category = sub_category;
//        System.out.println("Add Food Function of Admin Class");
    }
    
    public void delete_food()
    {
        System.out.println("Delete Food Function of Admin Class");
    }
    
    public void modify_menu()
    {
        System.out.println("Modify Menu Function of Admin Class");
    }
    
    public void make_deliver()
    {
        System.out.println("Make Deliver Function of Admin Class");
    }
    
    public void confirm_delivery()
    {
        System.out.println("Confirm Delivery Function of Admin Class");
    }
}

class Customer extends Guest
{
    private char id;
    protected char name;
    protected char address;
    protected int phone_no;
    protected char email;
    Cart c = new Cart();
    
    public Customer()
    {
        id = 0;
        name = 0;
        address = 0;
        phone_no = 0;
        email = 0;
    }
    
    public Customer(char id, char name, char address, int phone_no, char email)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
    }
    
    public void view_menu()
    {
        System.out.println("View Menu Function of Customer Class");
    }
    
    public void buy_food(int  number_of_products, char product, float price)
    {
       c.number_of_products = number_of_products;
       c.product = product;
       c.price = price;
       c.total =  number_of_products * price;
    }
    
    public void make_payment(float total)
    {
        System.out.println("Total payment is :- "+total);
    }
    
    public void add_to_cart(int number_of_products)
    {
        c.number_of_products = number_of_products + 1;
    }
    
    public void delete_from_cart(int number_of_products)
    {
        c.number_of_products = number_of_products - 1;
    }
}

class Product
{
    private int id;
    protected char name;
    protected char category;
    protected char sub_category;
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public int getid()
    {
        return id;
    }
    
    public void setname(char name)
    {
        this.name = name;
    }
    
    public char getname()
    {
        return name;
    }
    
    public void setcategory(char category)
    {
        this.category = category;
    }
    
    public char getcategory()
    {
        return category;
    }
    
    public void setsubcategory(char sub_category)
    {
        this.sub_category = sub_category;
    }
    
    public char getsub_category()
    {
        return sub_category;
    }
}



class Cart
{
    private int id;
    protected int number_of_products;
    protected char product;
    protected float price;
    protected float total;
}

class Payment
{
    private char card_type;
    private char card_no;
    protected char customer_id;
    public char name;
    
    public void setcard_type(char card_type)
    {
        this.card_type = card_type;
    }
    
    public char getcard_type()
    {
        return card_type;
    }
    
    public void setcard_no(char card_no)
    {
        this.card_no = card_no;
    }
    
    public char getcard_no()
    {
        return card_no;
    }
    
    public void setcustomer_id(char customer_id)
    {
        this.customer_id = customer_id;
    }
    
    public char getcustomer_id()
    {
        return customer_id;
    }
    
    public void setname(char name)
    {
        this.name = name;
    }
    
    public char getname()
    {
        return name;
    }
}

public class JavaApplication20 
{
    public static void main(String[] args) 
    {
        Guest g1 = new Customer();
        g1.view_menu();
        Guest g2 = new Admin();
        g2.view_menu();
    }
}
