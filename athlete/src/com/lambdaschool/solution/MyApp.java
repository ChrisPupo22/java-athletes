package com.lambdaschool.solution;

public class MyApp implements Processor {

    //constructor injections
    private AthleteCreationInt athSrv;

    public MyApp(AthleteCreationInt athSrv) {

        this.athSrv = athSrv;
    }

    @Override
    public void displayAthlete() {

        System.out.println("************");
        athSrv.displayAthlete();
        System.out.println("************");
    }


}
