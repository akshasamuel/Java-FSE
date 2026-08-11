import java.util.*;

public class SearchFunction{

    public static Product linearSearch(Product[] products, String searchName){
        for(Product product : products) {
            if(product.getProductName().equalsIgnoreCase(searchName)){
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String searchName){
        int left=0;
        int right=products.length - 1;

        while(left<=right){
            int mid=(left + right) / 2;
            int compare=products[mid].getProductName().compareToIgnoreCase(searchName);
            if(compare == 0){
                return products[mid];
            } 
            else if (compare < 0){
                left = mid + 1;
            } 
            else{
                right = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Product[] products={
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Shoes", "Footwear"),
            new Product("P003", "Mouse", "Electronics"),
            new Product("P004", "Keyboard", "Electronics"),
            new Product("P005", "T-shirt", "Clothing")
        };

        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();
        System.out.println("Linear Search");
        Product result1 = linearSearch(products, searchName);
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        System.out.println("Binary Search");
        Product result2 = binarySearch(products, searchName);
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
        scanner.close();
    }
}
