package com.commercetools.api.generated.models.zone;


import com.commercetools.api.generated.models.zone.Location;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LocationBuilder {
   
   
   private String country;
   
   @Nullable
   private String state;
   
   public LocationBuilder country( final String country) {
      this.country = country;
      return this;
   }
   
   public LocationBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public String getState(){
      return this.state;
   }

   public Location build() {
       return new LocationImpl(country, state);
   }
   
   public static LocationBuilder of() {
      return new LocationBuilder();
   }
   
   public static LocationBuilder of(final Location template) {
      LocationBuilder builder = new LocationBuilder();
      builder.country = template.getCountry();
      builder.state = template.getState();
      return builder;
   }
   
}