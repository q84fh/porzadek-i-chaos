class game {  
        public static void main(String args[]) {
           System.out.println("Hello World!");
           
           Plansza plansza = new Plansza();
           plansza.pola[0][1] = 5;
           
           plansza.wyswietlPlansze();
        }
}

class Plansza {
    public int iloscCzarnych = 18;
    public int iloscCzerwonych = 18;
    public int pola [][] = new int [6][6];  

    public void wyswietlPlansze() {
        for(int i = 0; i < pola.length; ++i) {
            for(int j = 0; j < pola.length; ++j) {
                System.out.print(pola[i][j] + " | ");
            }
            System.out.println();
            System.out.println();
        }
    }  
        
    public boolean wykonajRuch(int kolor, int pos1, int pos2) {
        return true;
    }
    
    public boolean czyJestPorzadek() {
        return true;
    }
    
    public boolean czyJestMozliwyPorzadek() {
        return true;
    }
    
}

class Gracz {
    public int afiliacja;
    public String nazwa;
}

class Rozgrywka {
    public Gracz czyjaTura;
    
    public void losujAfiliacje(Gracz g1, Gracz g2) {
        
    }
    
    public void kolejnaTura() {
        
    }
}