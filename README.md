# Book_Finder
Design Document  
  
Annamalai Subramanian,Howard Hall, Srishant Burdhan, Bidhatri Amatya

## Introduction
Have you ever had trouble finding the book required for your coursework? Have you ever wanted to find the next popular book that is released? The Book Finder will help you:

-Discover and locate the new and required books for you.
-Send reminders to users to go and check out the books.
-Find a book according to your interest and preferences.

Use the web application to manage and create your book list. Send reminders to users that forget they wanted to checkout a book. keep track of favorite or preferred book.

## Storyboard

## Functional Requirements

### Requirement 1: Search Book

#### Scenario
As a user studying, i want to be able to search up the book that is required for my class.

#### Examples

1.1
  
**Given** The book required for the class is Designing the user interface For beginners.

**When** I input Designing the user interface For beginners in the search bar

**Then**  I should be able to see the Designing the user interface For beginners books and similar books with titles similar to it
  
1.2
  
**Given** The book required for the class is Crash Course for java.

**When** I input Crash Course in the search bar

**Then**   I should be able to see all the Crash Courses text in the library database
  
1.3
  
**Given** The book required for the class is data structures.

**When** I input data structures in the search bar

**Then**   I should be able to see all the texts that have data structures titled
1.4
  
**Given** The book required for the class is mystery adventure.

**When** I input adventure in the search bar

**Then**   I should be able to see all the titles that are labled adventure.
 
1.5

**Given** The book required for the class is machine learning

**When** I input saefdsadsdfsadsfa

**Then**   I should see no titles

### Requirement 2: Send Reminders

#### Scenario
As a user checking out a book, The user should receive a reminder to go to a library and check the book out according to where its available
  
#### Examples

2.1
  
**Given** Designing the user interface For beginners has been selected to be checked out

**When** i click the checkout button

**Then**  I should receive a reminder on where i can checkout the book,Designing the user interface For beginners , according to where its available.
  
2.2 
  
**Given** data structures  has been selected to be checked out

**When** i click the checkout button

**Then**  I should receive a reminder on where i can checkout the book,data structures , according to where its available.
  
2.3 
  
**Given** mystery adventure has been selected to be checked out.

**When** i click the checkout button

**Then**   I should receive a reminder on where i can checkout the book,mystery adventure , according to where its available.
  
  
## Class Diagram
 ![Class Diagram](https://github.com/subrama2/Book_Finder/blob/main/BookFinder%20Class%20Diagram(1).jpg)
 ## Class Diagram Description
Person: Holds user specific information<br />
-Name: Name of user<br />
-Email Address: Email of user<br />
-Student Number: Student's school specific identification number<br />
-Reminders: Holds reminders set for each book<br />
+sendReminder: Checks for a time and sends a notification if time has exceeded the entry<br />
<br />
Book: Book specific information<br />
-Title: Title of book<br />
-Author: Author of the book<br />
-Genre: Genre of the book<br />
-Description: About the book's contents<br />
-ISBN: Book identification code<br />
-isInterested: Checked if a user checked out a book<br />
+setReminder: adds a title and time to the user's reminders<br />
<br />
Search: Stores search related information<br />
-Filters: Sets appropriate filters for a given search query<br />
-Results: Holds found results<br />
-Pages: Total pages of results<br />
+retrieveBooks: Retrieves books based on search query<br />
+formatResults: Formats results based on retrieved data<br />
+checkout: Adds book to reminders list<br />
<br />
 ## JSON Schema
 ```
{
	"Person": {
      "Name": "Name of user",
      "Email Address": "Email of user",
	  "Student Number": "Student school specific identification number",
      "Reminders": "Holds reminders set for each book"
    },
     "Book": {
      "Title": "Title of book",
      "Email Address": "Author of book",
	  "Student Number": "Genre of book",
      "Reminders": "About the book contents",
      "ISBN": "Book identification code",
      "isInterested": "Check if user checked out a book"
    },
     "Search": {
      "Filters": "Sets appropriate search filters for a given query",
      "Results": "Holds found results",
	  "Pages": "Total pages of results"
    }   
}
```

## Scrum Roles

* DevOps/Product Owner/Scrum Master: Annamalai Subramanian
* Frontend Developer: Howard Hall, Srishant Burdhan
* Integration Developer: Bidhatri Amatya

## Github Repo link

https://github.com/subrama2/Book_Finder

## Scrum Board
https://github.com/subrama2?tab=projects

## Weekly Meeting

thursday at 7PM. Microsoft Teams Group

Teams Meeting Link:

[https://teams.microsoft.com/_?lm=deeplink&lmsrc=NeutralHomePageWeb&cmpid=WebSignIn&culture=en-us&country=us#/conversations/19:edab28cd362646849e935d5670cf5e45@thread.v2?ctx=chat
](https://teams.microsoft.com/_?lm=deeplink&lmsrc=NeutralHomePageWeb&cmpid=WebSignIn&culture=en-us&country=us#/school/conversations/Group%202?threadId=19:c648c66d20844dcdabba684b3c4b365f@thread.tacv2&ctx=channel)


