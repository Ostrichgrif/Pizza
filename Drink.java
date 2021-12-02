public class Drink {
    int drink1;
    int drink2;
    int drink3;
    int drink4;
    int drink5;
    int drink6;
    int drink7;

    int drink1Size;
    int drink2Size;
    int drink3Size;
    int drink4Size;
    int drink5Size;
    int drink6Size;
    int drink7Size;

    public Drink(int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d1s, int d2s, int d3s, int d4s, int d5s, int d6s, int d7s) {
        drink1 = d1;
        drink2 = d2;
        drink3 = d3;
        drink4 = d4;
        drink5 = d5;
        drink6 = d6;
        drink7 = d7;

        drink1Size = d1s;
        drink2Size = d2s;
        drink3Size = d3s;
        drink4Size = d4s;
        drink5Size = d5s;
        drink6Size = d6s;
        drink7Size = d7s;
    }

    public String toString() {
        String s1="";
        String s2="";
        String s3="";
        String s4="";
        String s5="";
        String s6="";
        String s7="";

        char temp = ' ';


        if (drink1>0) {
           switch(drink1Size) {
               case 1: temp = 'S';
               case 2: temp = 'M';
               case 3: temp = 'L';
            }
            s1 = "Pepsi: " + drink1 + " Size: " + temp + "\n";
        }

        if (drink2>0) {
            switch(drink2Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s2 = "Pepsi: " + drink2 + " Size: " + temp + "\n";
        }

        if (drink3>0) {
            switch(drink3Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s3 = "Pepsi: " + drink3 + " Size: " + temp + "\n";
        }

        if (drink4>0) {
            switch(drink4Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s4 = "Pepsi: " + drink4 + " Size: " + temp + "\n";
        }

        if (drink5>0) {
            switch(drink5Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s5 = "Pepsi: " + drink5 + " Size: " + temp + "\n";
        }

        if (drink6>0) {
            switch(drink6Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s6 = "Pepsi: " + drink6 + " Size: " + temp + "\n";
        }

        if (drink7>0) {
            switch(drink7Size) {
                case 1: temp = 'S';
                case 2: temp = 'M';
                case 3: temp = 'L';
            }
            s7 = "Pepsi: " + drink7 + " Size: " + temp + "\n";
        }

        return s1 + s2 + s3 + s4 + s5 + s6 + s7;
    }
}
