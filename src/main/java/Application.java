import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        context.refresh();

        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        Music music = context.getBean("musicBean2", Music.class);
        MusicPlayer musicPlayer1= new MusicPlayer(music);
        musicPlayer.play();
        System.out.print("constructor: ");
        musicPlayer1.playMusic();
        context.close();
    }
}
