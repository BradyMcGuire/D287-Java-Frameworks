C.
file name: mainscreen.html
line number: 14
change: Title from "My Bicycle Shop" to "My Computer Shop"

file name: mainscreen.html
line number: 19
change: UI Title from "Shop" to "Computer Shop"

D.
file name: aboutPage.html
line number: 5 
change: Added "About" as the title

file name: aboutPage.html
line number: 10,11,12
change: Added text describing the buisness

file name: aboutPage.html
line number: 14
change: Added link back to main screen.

file name: aboutController.Java
line number: N/A
change: Created Controller file

file name: aboutController.Java
line number: 1-15
change: Created Controller that will return the about page.

file name: aboutPage.html
line number: 14
change: Added "Ready To Head Back? Click below" text

file name: aboutPage.html
line number: 15
change: link that directs user to Main Screen.

file name: mainScreen.html
line number: 90
change: Added "Check Out Our Story Below!" text

file name: mainScreen.html
line number: 91
change: link that directs user to the About Page.

E.

file name: BootStrapData.java
line number: 44
change: "Western Governors University" to "The Computer Shop"

file name: BootStrapData.java
line number: 44
change: "Western Governors University" to "The Computer Shop"

file name: BootStrapData.java
line number: 44
change: "Western Governors University" to "The Computer Shop"

file name: BootStrapData.java
line number: 43 - 86
change: Created the individual parts, Gave the parts: names, prices, inventory amount, and IDs, and them added them to the outsourced parts list.

file name: BootStrapData.java
line number: 88 - 92
change: remove some code causing errors with parts

F.

file name: mainscreen.html
line number: 82
change: Added "Buy Now" button to products list.

file name: buyNow.java
line number: N/A
change: created a buyNow controller to map to a purchase success screen.

file name: buyNow.java
line number: 12 - 14
change: created the logic to map to the new success screen.

file name: error.html
line number: N/A
change: created the page for when and error occurs

file name: buyNow.html
line number: N/A
change: created the page for when a purchase was successful

file name: buyNow.java
line number: 15-34
change: created a system to intake the id of the product, relay that to the database, determines if its real, and remove 1 from the inventory. IF it's not real, or inventory is zero, it returns an error. It will also determine which HTML file to go to depending on purchase success.

file name: buyNow.html
line number: N/A
change: created the page for when a purchase was successful

G.

file name: BootStrapData.java
line number: 49,50,60,61,71,72,82,83,93,94
change: created min and max inventory values for each part.

file name: inHousePartForm.html
line number: 24-28
change: created fields for Min and Max inventory values.

file name: mainscreen.html
line number: 48,49
change: created part of the table to include min and max inventory amounts, mostly testing reasons, but left it for transparency.

file name: outsourcePartForm.html
line number: 25-29
change: created fields for Min and Max inventory values.

file name: part.java
line number: 32-35
change: created inventory min and max variables, with validators attached.

file name: part.java
line number: 116-136
change: setters and getters and constructors form min and max variables.

file name: part.java
line number: 22
change: set Custom Validator.

file name: ValidatorInventory.java
line number: N/A
change: created UI for Custom Validator.

file name: InventoryValidator.java
line number: N/A
change: created logic for Custom Validator.

file name: application.properties
line number: 6
change: changed data source to spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-SpringBootProject

H.
file name: addInhousePartController
line number: 42 - 49
change: added a new if statement to check for inventory min and max was not being crossed.

file name: addOutsourcedPartController
line number: 43 - 50
change: added a new if statement to check for inventory min and max was not being crossed.

file name: EnufPartsValidator
line number: 37-39
change: added a new if statement to check for that part inventory does not fall below the minimum when creating a product

file name: ValidEnufParts
line number: 20
change: updated error message to "Low Inventory or there are not enough parts in inventory!", to be more inline with the proper error.

I.
file name: PartTest.java
line number: 160-167
change: created a test for minimum Inventory, Passed

file name: PartTest.java
line number: 168-175
change: created a test for maximum Inventory, Passed

file name: pom.xml
line number: 53-55
change: updated junit, as well as specified version.

J.

file name: DeletePartValidator.java
line number: N/A
change: Was never used.

