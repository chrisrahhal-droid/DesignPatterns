package LegacyAudioSystemIntegration;
public class App {
    public static void main(String[] args){
        LegacyOggPlayer lop = new LegacyOggPlayer();
        ModernAudioPlayer oa = new OggAdapter(lop);
        oa.playAudio("boss_theme.ogg");
    }
}
