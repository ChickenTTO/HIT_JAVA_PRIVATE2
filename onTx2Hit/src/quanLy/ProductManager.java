package quanLy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author datch
 */
public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    public void addProduct(Product product, User user){
        if(user.getRole()==Role.ADMIN)
        {
            productList.add(product);
        }else{
            System.out.println("Ban khong co quyen thuc hien chuc nang nay!");
        }
    }
    
    public void displayProduct(){
        if(productList.isEmpty())
        {
            System.out.println("Danh sach trong!");
        }else{
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
    
    public void sortByName(String name){
        for (Product product : productList) {
            if(product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
            }else{
                System.out.println("Khong tim thay ten "+name+" trong danh sach");
            }
        }
    }
    
    public void delById(String id, User user){
        if(user.getRole()==Role.ADMIN)
        {
            for (Product product : productList) {
                if(product.getId().equalsIgnoreCase(id))
                {
                    productList.remove(id);
                    System.out.println("Da xoa id "+id);
                }else{
                    System.out.println("Khong tim thay id "+id);
                }
            }
        }else{
            System.out.println("Ban khong co quyen thuc hien chuc nang tren");
        }
    }
    
    public void updateProduct(String id, User user, Scanner s){
        if(user.getRole()==Role.ADMIN)
        {
            for (Product product : productList) {
                if(product.getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap ten moi: ");
                    product.setName(s.nextLine());
                    System.out.print("Nhap so luong moi: ");
                    product.setQuantity(s.nextInt());
                    System.out.print("Nhap gia moi: ");
                    product.setPrice(s.nextDouble());
                }else{
                    System.out.println("Khong tim thay id: "+id);
                }
            }
        }else{
            System.out.println("Ban khong co quyen thuc hien chuc nang tren!");
        }
    }
}
