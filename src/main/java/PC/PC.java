package PC;

public class PC {
    private VideoCard videoCard;
    public PC(VideoCard videoCard){

        this.videoCard=videoCard;
    }
    public VideoCard getVideoCard(){
        return videoCard;
    }
    public  void pcOFF(){
        videoCard.videoStop();
    }
}
