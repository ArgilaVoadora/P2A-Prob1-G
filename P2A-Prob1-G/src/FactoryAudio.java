
public class FactoryAudio {

    public FormatoAudio getFormato(String file) {
        String[] ex = file.split("\\.");
        String extencao = ex[1];
        switch (extencao.toUpperCase()) {
            case "WAV":
                return new ManipulaWAV();
            case "WMA":
                return new ManipulaWMA();
            case "AIFF":
                return new ManipulaAIFF();
        }
        return null;
    }
}
