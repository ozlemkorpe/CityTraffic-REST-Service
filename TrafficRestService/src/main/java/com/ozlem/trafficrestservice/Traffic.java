package com.ozlem.trafficrestservice;

import com.opencsv.bean.CsvBindByName;

public class Traffic {
	private int date;
    @CsvBindByName
    private int ParkAndCampus;
    @CsvBindByName
    private int SeventhUnderpass;
    @CsvBindByName
    private int SeventhUnderpassPedestrians;
    @CsvBindByName
    private int SeventhUnderpassCyclists;
    @CsvBindByName
    private int BlineConventionCntr;
    @CsvBindByName
    private int Pedestrians;
    @CsvBindByName
    private int Cyclists;
    @CsvBindByName
    private int JordanAndSeventh;
    @CsvBindByName
    private int NCollegeAndRR;
    @CsvBindByName
    private int WallnutAndWylie;
    
    public Traffic(int date, int ParkAndCampus, int SeventhUnderpass,int SeventhUnderpassPedestrians
    		, int SeventhUnderpassCyclists, int BlineConventionCntr, int Pedestrians, int Cyclists, int JordanAndSeventh,
    		int NCollegeAndRR, int WallnutAndWylie ) {
    	
        this.date = date;
        this.ParkAndCampus = ParkAndCampus;
        this.SeventhUnderpass = SeventhUnderpass ;
        this.SeventhUnderpassPedestrians = SeventhUnderpassPedestrians;
        this.SeventhUnderpassCyclists = SeventhUnderpassCyclists;
        this.BlineConventionCntr = BlineConventionCntr;
        this.Pedestrians =  Pedestrians;
        this.Cyclists = Cyclists;
        this.JordanAndSeventh = JordanAndSeventh;
        this.NCollegeAndRR = NCollegeAndRR;
        this.WallnutAndWylie = WallnutAndWylie ;

    }
    
    public int getDate() {
        return date;
    }
    
    public void setDate(int date) {
        this.date = date;
    }
    
    public int getParkAndCampus() {
        return ParkAndCampus;
    }
    
    public void setParkAndCampus(int ParkAndCampus) {
        this.ParkAndCampus = ParkAndCampus;
    }
    
    public int getSeventhUnderpass() {
        return SeventhUnderpass;
    }
    
    public void setSeventhUnderpass(int SeventhUnderpass) {
        this.SeventhUnderpass = SeventhUnderpass;
    }
    
    public int getSeventhUnderpassPedestrians() {
        return SeventhUnderpassPedestrians;
    }
    
    public void setSeventhUnderpassPedestrians(int SeventhUnderpassPedestrians) {
        this.SeventhUnderpassPedestrians = SeventhUnderpassPedestrians;
    }
   
    public int getSeventhUnderpassCyclists() {
        return SeventhUnderpassCyclists;
    }
    
    public void setSeventhUnderpassCyclists(int SeventhUnderpassCyclists) {
        this.SeventhUnderpassCyclists = SeventhUnderpassCyclists;
    }
    
    public int getBlineConventionCntr() {
        return BlineConventionCntr;
    }
    
    public void setBlineConventionCntr(int BlineConventionCntr) {
        this.BlineConventionCntr = BlineConventionCntr;
    }
    
    public int getPedestrians() {
        return Pedestrians;
    }
    
    public void setPedestrians(int Pedestrians) {
        this.Pedestrians = Pedestrians;
    }
    public int getCyclists() {
        return Cyclists;
    }
    
    public void setCyclists(int Cyclists) {
        this.Cyclists = Cyclists;
    }
    public int getJordanAndSeventh() {
        return JordanAndSeventh;
    }
    
    public void setJordanAndSeventh(int JordanAndSeventh) {
        this.JordanAndSeventh = JordanAndSeventh;
    }
    public int getNCollegeAndRR() {
        return NCollegeAndRR;
    }
    
    public void setNCollegeAndRR(int NCollegeAndRR) {
        this.NCollegeAndRR = NCollegeAndRR;
    }
    
    public int getWallnutAndWylie() {
        return WallnutAndWylie;
    }
    
    public void setWallnutAndWylie(int WallnutAndWylie) {
        this.WallnutAndWylie = WallnutAndWylie;
    }

}
