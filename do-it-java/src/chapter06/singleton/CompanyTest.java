package chapter06.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company myComapny1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();
        System.out.println(myComapny1 == myCompany2);
    }
}
