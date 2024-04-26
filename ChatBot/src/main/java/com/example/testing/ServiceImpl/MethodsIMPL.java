package com.example.testing.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.testing.Converter.PackageConverter;
import com.example.testing.Dto.UserPackageDetails;
import com.example.testing.Entity.Packages;
import com.example.testing.Repository.PackagesDao;

@Component
public class MethodsIMPL 
{
	@Autowired
	private PackagesDao packageDao;
	
	@Autowired
	private PackageConverter converter;

	private String[] keywords = {
            "Vacation packages",
            "Tour packages",
            "Holiday deals",
            "All-inclusive packages",
            "Travel bundles",
            "Getaway packages",
            "Adventure tours",
            "Cruise packages",
            "Group travel packages",
            "Honeymoon packages",
            "Family vacation deals",
            "Luxury travel packages",
            "Budget travel packages",
            "Destination packages",
            "Customized travel packages",
            "Special offers",
            "Last-minute deals",
            "Weekend getaways",
            "Escorted tours",
            "Sightseeing packages",
            "Cultural tours",
            "Eco-tourism packages",
            "Safari packages",
            "Wellness retreats",
            "Ski packages",
            "Beach vacation packages",
            "Romantic getaways",
            "Solo traveler packages",
            "Educational tours",
            "Seasonal vacation packages",
            "Travel packages",
            "tour",
            "travel",
            "Vacation",
            "Holiday",
            "trip"
        };
	
	public  boolean containsKeyword(String word) {
        for (String keyword : keywords) {
            if (word.toLowerCase().contains(keyword.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
	
	public String checkInput(Boolean check) throws InterruptedException
	{
		if(check)
		{
			 Thread.sleep(1000); 
		        System.out.println("Ok.....");
		        Thread.sleep(1000); 
		        System.out.println("Some of Our Popular Packages...");
		        List<Packages> packages = getPackages();
		        List<Object> dtos= new ArrayList<>();
		        
		        for(int i=0;i<=4;i++)
		        {
		        	Packages p = packages.get(i);
		        	dtos.add(converter.entityToDto(p));
		        }
		        
		        for(int i=0;i<=dtos.size()-1;i++)
		        {
		        	String valueOf = String.valueOf(dtos.get(i));
		        	StringBuilder sb = new StringBuilder(valueOf);
		        	int indexOf2 = sb.indexOf(")");
		        	sb.replace(indexOf2, indexOf2+1, "");
		        	int indexOf = sb.indexOf("(");
		        	sb.replace(0, indexOf+1, "");
		        	String updatedString = sb.toString();
		        	String[] split = updatedString.split(",");
		        	
		        	List<String> st = new ArrayList<>();
		        		
		        	for(int j=0;j<=split.length-1;j++)
		        	{
		        		if(j%2!=0 || j==0)
		        		{
		        			String[] split2 = split[j].split("=");
		        			for(int k=0;k<=split2.length-1;k++)
		        			{
		        				if(k%2!=0)
		        				{
		        					st.add(split2[k]);
		        				}
		        			}
		        		}
		        	}
//		        	System.out.println(st);
//		        	System.out.println(sb);
		        	System.out.println(dtos);
		        }
		        
		}
		return "Sorry i can't do this...";
	}
	
	public List<Packages> getPackages()
	{
		return packageDao.findAll();
		
	}
}
