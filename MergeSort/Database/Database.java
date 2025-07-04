import java.util.ArrayList;

public class Database {
    private ArrayList<Registration> registrations = new ArrayList<>();

    public Database() {
        // Initialize the ArrayList of registrations

        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        registrations.add(new Registration("DYC-5707", "Jodi Gatfield"));
        registrations.add(new Registration("GIG-1870", "Harvey Kenny"));
        registrations.add(new Registration("NWK-2057", "Janice Hudson"));
        registrations.add(new Registration("BYJ-6279", "Larry Newman"));
        registrations.add(new Registration("ENY-2915", "Helen Pryor"));
        registrations.add(new Registration("OYW-0632", "Quincy Cromwell"));
        registrations.add(new Registration("KEC-3996", "Kathy Myers"));
        registrations.add(new Registration("HOZ-1224", "Hugh Haines"));
        registrations.add(new Registration("KGJ-5010", "Tammy Mallard"));
        registrations.add(new Registration("FVA-4467", "Michael Knowles"));
        registrations.add(new Registration("NEV-9119", "Michael Knowles"));
        registrations.add(new Registration("BJT-9772", "Karl Yardley"));
        registrations.add(new Registration("YQD-3410", "Andrea Elsworth"));
        registrations.add(new Registration("DUY-0288", "Jay Zagorski"));
        registrations.add(new Registration("ATZ-9783", "Sally Oakes"));
        registrations.add(new Registration("IAG-6602", "Patrick Hewitt"));
        registrations.add(new Registration("DCP-2974", "Donna Wardman"));
        registrations.add(new Registration("FAH-2515", "Jay Newton"));
        registrations.add(new Registration("GYF-3958", "Carla Collins"));
        registrations.add(new Registration("NCL-9068", "James McBride"));
        registrations.add(new Registration("UBJ-1923", "Helen Gibbs"));
        registrations.add(new Registration("UUG-4837", "Conrad Pryor"));
        registrations.add(new Registration("GMD-6786", "Tracy Gilbert"));
        registrations.add(new Registration("QTW-6473", "Donald Gatfield"));
        registrations.add(new Registration("QQE-3264", "Charlotte Newport"));
        registrations.add(new Registration("WAO-8258", "Rodney Gilbert"));

    }

    public void printAll() {
        for (Object obj : registrations) {
            Registration reg = (Registration) obj;
            System.out.println(reg);
        }
    }

    public void mergeSort() {
        int n = registrations.size();

        for (int subArrSize = 1; subArrSize < n; subArrSize *= 2) {
            for (int leftStart = 0; leftStart < n - subArrSize; leftStart += 2 * subArrSize) {

                int rightStart = leftStart + subArrSize;
                int rightEndExcluded = Math.min(leftStart + 2 * subArrSize, n);
                ArrayList<Registration> leftArray = new ArrayList<>(registrations.subList(leftStart, rightStart));
                ArrayList<Registration> rightArray = new ArrayList<>(
                        registrations.subList(rightStart, rightEndExcluded));
                merge(leftStart, leftArray, rightArray);
            }
        }
    }

    private void merge(int mergeIndex, ArrayList<Registration> leftArray, ArrayList<Registration> rightArray) {
        int left_Indx = 0, right_Indx = 0;
        Registration leftVal;
        Registration rightVal;
        while (left_Indx < leftArray.size() && right_Indx < rightArray.size()) {
            leftVal = (Registration) leftArray.get(left_Indx);
            rightVal = (Registration) rightArray.get(right_Indx);

            if (leftVal.license.compareTo(rightVal.license) <= 0) {

                this.registrations.set(mergeIndex, leftVal);
                left_Indx++;
            } else {

                this.registrations.set(mergeIndex, rightVal);
                right_Indx++;
            }
            mergeIndex++;
        }

        while (left_Indx < leftArray.size()) {

            leftVal = (Registration) leftArray.get(left_Indx);

            this.registrations.set(mergeIndex, leftVal);
            left_Indx++;
            mergeIndex++;
        }

        while (right_Indx < rightArray.size()) {

            rightVal = (Registration) rightArray.get(right_Indx);

            this.registrations.set(mergeIndex, rightVal);
            right_Indx++;
            mergeIndex++;
        }
    }

    public void insertionSort() {
        int regCount = registrations.size();
        for (int unsortedIndx = 1; unsortedIndx < regCount; unsortedIndx++) {
            Registration unsortedReg = (Registration) registrations.get(unsortedIndx);
            int sortedIndx = unsortedIndx - 1;
            while (sortedIndx >= 0) {
                Registration sortedReg = (Registration) registrations.get(sortedIndx);
                if (sortedReg.license.compareTo(unsortedReg.license) > 0) {
                    registrations.set(sortedIndx + 1, sortedReg);
                    sortedIndx--; // Move to the next element to the left
                } else {
                    break;
                }
            }
            registrations.set(sortedIndx + 1, unsortedReg);
        }
    }

    public void bubbleSort() {
        int n = registrations.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Registration currentReg = (Registration) registrations.get(j);
                Registration nextReg = (Registration) registrations.get(j + 1);
                if (currentReg.license.compareTo(nextReg.license) > 0) {
                    registrations.set(j, nextReg);
                    registrations.set(j + 1, currentReg);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Database db = new Database();

        db.mergeSort();

        System.out.println("\n******* Sorted ArrayList ******\n");
        db.printAll();

    }
}
