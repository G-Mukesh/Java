class Bank {
     double getInterestRate() {
        return 0.0; 
    }
}

class SBIBank {
    
    public double getInterestRate() {
        return 8.4;
    }
}

class ICICIBank {
    
    public double getInterestRate() {
        return 7.3;
    }
}

class AxisBank {
    
    public double getInterestRate() {
        return 9.7;
    }
}

public class Banks {
    public static void main(String[] args) {
        Bank sbi = new SBIBank();
        Bank icici = new ICICIBank();
        Bank axis = new AxisBank();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
        System.out.println("Axis Interest Rate: " + axis.getInterestRate() + "%");
    }
}