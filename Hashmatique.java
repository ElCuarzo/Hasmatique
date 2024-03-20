import java.util.HashMap;
import java.util.Map;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("BeReal", "Me pregunto cómo sabes de mí siempre sabe lo que estoy haciendo...");
        trackList.put("Lenguas Muertas", "Dices que siempre estamos solos que nunca llegas pronto...");
        trackList.put("Kilómetros", "A varios cientos de kilómetros puede tu voz darme calor igual que un sol...");
        trackList.put("Sweater Wheater", "And all i am is a man i want the world in my hands...");

        String titulo = "Sweater Wheater";
        String letra = trackList.get(titulo);
        System.out.println("El nombre de su cancion es: " + titulo + " | La letra de su cancion es: " + letra);

        System.out.println("Lista de canciones: ");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}