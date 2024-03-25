import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spesa {
    public static void main(String[] args) {
        // Definizione dei prezzi degli articoli
        float PrezzoCaffe = 1.0f;
        float PrezzoCornetto = 1.20f;
        float PrezzoSigarette = 5.30f;
        float PrezzoGrattaEVinci = 3.0f;
        float PrezzoTrasporto = 1.50f;
        float PrezzoPersonali = 7.0f;
        float PrezzoAcqua = 0.50f;
        
        // Inizializzazione della somma totale
        float totale = 0.0f;
        
        // Gestione della selezione degli articoli
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader tastiera = new BufferedReader(input);
            
            while (true) {
                System.out.println("Quali articoli desideri acquistare?");
                System.out.println("1. Caffè");
                System.out.println("2. Cornetto");
                System.out.println("3. Sigarette");
                System.out.println("4. Gratta e vinci");
                System.out.println("5. Trasporto");
                System.out.println("6. Articoli personali");
                System.out.println("7. Acqua");
                System.out.println("8. Esci");
                System.out.print("Scelta: ");
                
                String inputString = tastiera.readLine();
                int scelta = Integer.parseInt(inputString);
                
                if (scelta == 8) {
                    break;
                }
                
                switch (scelta) {
                    case 1:
                        totale += PrezzoCaffe;
                        break;
                    case 2:
                        totale += PrezzoCornetto;
                        break;
                    case 3:
                        totale += PrezzoSigarette;
                        break;
                    case 4:
                        totale += PrezzoGrattaEVinci;
                        break;
                    case 5:
                        totale += PrezzoTrasporto;
                        break;
                    case 6:
                        totale += PrezzoPersonali;
                        break;
                    case 7:
                        totale += PrezzoAcqua;
                        break;
                    default:
                        System.out.println("Scelta non valida.");
                        break;
                }
                
                System.out.println("Totale parziale: " + totale + " euro");
            }
        } catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        }
        
        // Stampa del totale della spesa
        System.out.println("Il totale della spesa è: " + totale + " euro");
    }
}