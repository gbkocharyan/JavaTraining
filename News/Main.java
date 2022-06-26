package com.company.News;

public class Main {
    public static void main(String[] args) {
        NewsPage mamulAM= new NewsPage();
        String content="Aysorvanic toshaknery kbardzranan 700%-ov";
        mamulAM.post(content);
        mamulAM.setOnNewPostListener(new OnNewPostListener() {
            @Override
            public void newPostPublished(String content) {
                System.out.println(content);
            }
        });
        mamulAM.post("Ashkhatanqayin orery darnum en 2 or");
        User user1=new User("Mamikon");
        mamulAM.setOnNewPostListener(user1);
        mamulAM.post("Kensatoshakayin tariqy darnum e 30");
    }
}
