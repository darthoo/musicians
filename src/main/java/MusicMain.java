import config.AppConfig;
import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugen on 3/3/17.
 */
public class MusicMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AreaService areaService = context.getBean(AreaService.class);
        UserService userService = context.getBean(UserService.class);
        CompositionService compositionService = context.getBean(CompositionService.class);
        System.out.println(areaService.findAll());
        //userService.save(generateUser());
        System.out.println(userService.findAll());
        System.out.println(compositionService.findAll());
        /*areaService.save(generateArea());
        System.out.println(areaService.findAll());*/
        //System.out.println(areaService.getAreaByName("Jazz*");
    }

    private static Composition generateComposition(){
        Composition composition = new Composition();
        composition.setName("Mother Song");
        composition.setArtist("Sinoptik");
        composition.setDuration(4.35f);
        composition.setRating(5.0f);
        return composition;
    }

    private static User generateUser() {
        List<Composition> playlist = new ArrayList<Composition>();
        playlist.add(generateComposition());
        User user = new User();
        user.setName("Smb");
        user.setAge(22);
        user.setCompositions(playlist);
        return user;
    }
    private static Area generateArea() {
        Area area = new Area();
        area.setName("Jazzter");
        area.setAddress("Poetry square");
        area.setNumOfPlaces(100);
        return area;
    }

}

