# Book_Finder
Design Document  
  
Annamalai Subramanian, Howard Hall, Srishant Burdhan, Bidhatri Amatya

## Introduction
Have you ever had trouble finding the book required for your coursework? Have you ever wanted to find the next popular book that is released? The Book Finder will help you:

-Discover and locate the new and required books for you.
-Find a book according to your interest and preferences.

Use the web application to manage and create your book list. keep track of favorite or preferred book.

## Storyboard

![Screen 1](https://github.com/subrama2/Book_Finder/assets/113551683/23365342-9efc-4bc2-822d-d552de59e6d2)
![Screen 2](https://github.com/subrama2/Book_Finder/assets/113551683/68fbff1d-8428-46d5-9e0e-f9ac8ad5f9d2)
![Screen 3](https://github.com/subrama2/Book_Finder/assets/113551683/760a0970-dffd-4cad-bff0-aae2c688f5c1)
![Screen 4](https://github.com/subrama2/Book_Finder/assets/113551683/ed080b01-8b69-49e4-a6f4-fbb8c8fc8d1b)

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

## Current Website Functionality
Our Book Finder application has recently undergone significant enhancements. The current state of the application includes the following functionalities:

    Functional Database:
        A fully functional database is now integrated with the application.
        The database stores comprehensive information about various books.

    Book Search Capability:
        Users can search for books using the search function, which queries the database for relevant results.
        The search feature is robust, allowing users to find books based on titles, authors, genres, and other keywords.

    Home Page with Prepopulated Books:
        The home page is dynamically populated with a selection of books.
        Featured books and popular titles are highlighted to engage users upon their visit.

    Results Page for Book Display:
        A dedicated results page showcases books based on the user's search query.
        This page displays book information such as titles, authors, cover images, and brief descriptions.

    Autocomplete Functionality Site-Wide:
        Autocomplete has been implemented to enhance the user experience during searches.
        This feature suggests possible book titles or authors as the user types, making the search process more efficient.

    Login Page:
        A secure login page has been established for user authentication.  
## Class Diagram
 ![Class Diagram](https://github.com/subrama2/Book_Finder/blob/main/BookFinder%20Class%20Diagram%20(1).jpg)
 ## Class Diagram Description
Person: Holds user specific information<br />
-Name: Name of user<br />
-Email Address: Email of user<br />
-Student Number: Student's school specific identification number<br />

<br />
Book: Book specific information<br />
-Title: Title of book<br />
-Author: Author of the book<br />
-Genre: Genre of the book<br />
-Description: About the book's contents<br />
-ISBN: Book identification code<br />
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
     "Student Number": "Student school specific identification number"
   },
    "Book": {
     "Title": "Title of book",
     "Email Address": "Author of book",
     "Student Number": "Genre of book",
     "Reminders": "About the book contents",
     "ISBN": "Book identification code"
   },
    "Search": {
     "Filters": "Sets appropriate search filters for a given query",
     "Results": "Holds found results"
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


