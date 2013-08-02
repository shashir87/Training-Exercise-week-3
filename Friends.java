import java.io.Serializable;


public class Friends implements Serializable{
	transient String friendName;
	Friends(){
		friendName="Some One";
	}

}
