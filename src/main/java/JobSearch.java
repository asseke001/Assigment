public class JobSearch {
    public static void main(String[] args){
        JavaDeveloperJobSite jobSite=new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");


        Observer firstSubscriber=new Subscriber(" Amangeldi ","Asylzhan");
        Observer secondSubscriber=new Subscriber(" Yera ", "Akhmer");


        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("Second Java Position");
    }
}
