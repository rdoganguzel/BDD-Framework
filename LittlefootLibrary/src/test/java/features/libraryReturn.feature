Feature: Library Book Return

Scenario Outline: Book Return Form 

Given User is on book return page
When User fills the form <name> <title> <author> <pages> <dewey> <readOrNot> <time> <rating>
Then Click submit
And Close the browser

Examples:
|name		|title				|author		   	|pages  	|dewey		 	|readOrNot	|time	         	|rating	|
|frank		|Philosophy 			|Donald 		|657	  	|120.563DUC   	|read		|2_3weeks         	| 1		|
|mike		|Math  				|Mickey			|1200   	|125.563MOU   	|partially	|morethen_4weeks  	| 5		|
|john		|Science	 		|Rick 			|145	  	|601.103SAN   	|read		|2_3weeks         	| 1		|
|erik		|Statistics			|Solitude 	 	|734	   	|834.334OBR   	|unread		|less_week        	| 4		|


Scenario: Report
Given Report the Records to a txt file




