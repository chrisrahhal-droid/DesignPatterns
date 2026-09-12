package LegacyAudioSystemIntegration;
public class OggAdapter implements ModernAudioPlayer{
    private LegacyOggPlayer lop;
    
    public OggAdapter(LegacyOggPlayer lop){
        this.lop = lop;
    }

    @Override
    public void playAudio(String fileName) {
        lop.playOggFile(fileName);
    }

}
