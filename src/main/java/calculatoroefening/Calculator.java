package calculatoroefening;

public class Calculator {

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else if (numbers.charAt(0) == '/') {
            boolean b = true;
            int teller = 0;
            String delimeter = "";
            while (b) {
                if ((numbers.charAt(teller) == '\\') && (numbers.charAt(teller + 1) == 'n')) {
                    for (int i = 2; i < teller; i++) {
                        delimeter = delimeter + numbers.charAt(i);
                    }
                    numbers = numbers.substring(teller + 2, numbers.length() + 1);
                    b = false;
                }
            }
        }
        String[] x = numbers.split(",");
          int totaal = 0;
          for (int i = 0; i < x.length; i++) {
              String[] s = x[i].split("\n");
              for (int j = 0; j < s.length; j++) {
                 totaal = totaal + Integer.parseInt(s[j]);
              }
        }
        return totaal;
    }
 }
