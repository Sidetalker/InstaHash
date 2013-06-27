package instahash;

import org.jinstagram.*;
import org.jinstagram.entity.tags.TagSearchFeed;
import org.jinstagram.entity.users.basicinfo.*;
import org.jinstagram.exceptions.InstagramException;

import com.sola.instagram.auth.InstagramAuthentication;

public class InstaHash
{
   public static void main(String[] args)
   {
      System.out.println("Hello World!");
      
      // InstagramAuthentication auth =  new InstagramAuthentication(); 
     
      Instagram testInstance = new Instagram("a3d07a3cc65445e08ebd6dc958fe6b05");
      
      long userId = 3;
      UserInfo userInfo;
      try
      {
         TagSearchFeed testTagSearch = testInstance.searchTags("cat");
         System.out.println(testTagSearch.toString());
         testInstance.
         
         
         userInfo = testInstance.getUserInfo(userId);
         
         UserInfoData userData = userInfo.getData();
         System.out.println("id : " + userData.getId());
         System.out.println("first_name : " + userData.getFirst_name());
         System.out.println("last_name : " + userData.getLast_name());
         System.out.println("profile_picture : " + userData.getProfile_picture());
         System.out.println("website : " + userData.getWebsite());
      } catch (InstagramException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }


   }
}
