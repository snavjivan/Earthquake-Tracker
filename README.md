# Interactive Earthquake Map

This Java Application reads an [RSS feed] (http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom) of recent earthquakes and their information and uses the Google Maps API, Unfolding Maps API, and JavaFX to create an interactive map of the earthquakes.

The application plots all earthquakes with a magnitude greater than 2.5 on the map, and is able to give specific information about each quake. The map is capable of classifying earthquakes by how recently they've happened, how deep within the earth they occurred, and whether they occurred on land or in water. It can also filter quakes by their magnitude and the country they occurred in, and show their relation to major cities and sites (e.g. airports). Lastly, by accounting for earthquake magnitude, location, and other geological factors, the map is even able to determine what major cities and sites may be in danger from the effects of an earthquake.

To run the application, run the driver class: `EarthquakeCityMap.java`. If you are working offline, set the boolean variable `offline` in the driver class to `true`.

This project was built in conjunction with the Coursera course "Object Oriented Programming in Java" taught by faculty at the University of California, San Diego.