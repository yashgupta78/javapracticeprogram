
import java.util.*;

class TravelAgencies {

    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    int getRegNo() {
        return regNo;
    }

    String getAgencyName() {
        return agencyName;
    }

    String getPackageType() {
        return packageType;
    }

    int getPrice() {
        return price;
    }

    boolean getFlightFacility() {
        return flightFacility;
    }
}

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies arr[] = new TravelAgencies[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            boolean e = sc.nextBoolean();

            arr[i] = new TravelAgencies(a, b, c, d, e);
        }
        int maxPrice = findAgencyWithHigestPackagePrice(arr);

        int inputRegNo = sc.nextInt();
        sc.nextLine();
        String inputPackageType = sc.nextLine();

        TravelAgencies obj = agencyDetailsForGivenIdAndType(arr, inputRegNo, inputPackageType);
        System.out.println(maxPrice);
        if (obj == null) {
            System.out.println("No agency found");

        } else {
            System.out.println(obj.agencyName + ":" + obj.price);
        }

    }

    public static int findAgencyWithHigestPackagePrice(TravelAgencies arr[]) {
        int maxx = arr[0].price;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].price > maxx) {
                maxx = arr[i].price;
            }
        }
        return maxx;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies arr[], int inputRegNo, String inputPackageType) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].flightFacility == true) {
                if (arr[i].regNo == inputRegNo && inputPackageType.equalsIgnoreCase(arr[i].getPackageType())) {
                    return arr[i];
                }
            }
        }
        return null;
    }
}