package _this;

public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    // 생성자 매개변수 1 ~ 5개  --> 생성자 5개 (오버로딩)
    public UserInfo(String userId) {
        System.out.println("1번 생성자 호출");
        this.userId = userId;
    }

    public UserInfo(String userId, String userPassword) {
        this(userId);
        System.out.println("2번 생성자 호출");
        this.userPassword = userPassword;
    }

    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        System.out.println("3번 생성자 호출");
        this.userName = userName;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        System.out.println("4번 생성자 호출");
        this.userAddress = userAddress;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this(userId, userPassword, userName, userAddress);
        System.out.println("마지막 5번 생성자 호출");
        this.phoneNumber = phoneNumber;
    }

    // getter 메서드
    public String getUserId(){
        return userId;
    }

    public String getUserPassword(){
        return userPassword;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserAddress(){
        return userAddress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    // setter 메서드
    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserAddress(String userAddress){
        this.userAddress = userAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.println("----- showInfo -----");
        System.out.println("유저 ID : " + userId);
        System.out.println("유저 Password : " + userPassword);
        System.out.println("유저 Name : " + userName);
        System.out.println("유저 Address : " + userAddress);
        System.out.println("유저 Phone : " + phoneNumber);
    }


}
