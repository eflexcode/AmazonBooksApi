# AmazonBooksAPi

 This is a reactive (webflux) rest api give client access to query about 200,000 book on amazon. 

## Api Urls
    
 - I hosted on ```https://amazonbooksapi.onrender.com```
- Testing offline would be ```http://localhost:8080```

## Credits
  Dataset gotten from [kaggle](https://www.kaggle.com/datasets/saurabhbagchi/books-dataset)

## Database used
   postgres, code to upload csv to postgres is in AmazonBooksApiApplication class



## Api endpoints

 #### Creat Apikey                                                                                                 
  ``` 
  Request type: POST 
  
  https://amazonbooksapi.onrender.com/api_users/create_apikey?email=youremail@email.com
  http://localhost:8080/api_users/create_apikey?email=youremail@email.com   
  
  Returned json
  ```
``` json
  {
	"email": "youremail@email.com",
	"apiKey": "19734wbe12-969f-483e-8c07-ab4dd15028"
  }
  
```
#### Forgot Apikey
 ``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/api_users/get_apikey?email=youremail@email.com
  http://localhost:8080/api_users/get_apikey?email=youremail@email.com  
  
  Returned json
  ```
``` json

  {
	"email": "youremail@email.com",
	"apiKey": "19734wbe12-969f-483e-8c07-ab4dd15028"
  } 
```
#### Delete Apikey

 ```
  Request type: DELETE 
  
  https://amazonbooksapi.onrender.com/api_users/delete?email=youremail@email.com
  http://localhost:8080/api_users/delete?email=youremail@email.com  
  
  Returned json
  
  empty 
```

#### Get Book By ID

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/book/207
  http://localhost:8080/books/book/207  
  
  Returned json
  ```
``` json
  {
    "id": 207,
    "isbn": "0060977493",
    "title": "The God of Small Things",
    "author": "Arundhati Roy",
    "yearOfPublication": 1998,
    "publisher": "Perennial",
    "imageUrlS": "http://images.amazon.com/images/P/0060977493.01.THUMBZZZ.jpg",
    "imageUrlM": "http://images.amazon.com/images/P/0060977493.01.MZZZZZZZ.jpg",
    "imageUrlL": "http://images.amazon.com/images/P/0060977493.01.LZZZZZZZ.jpg"
  }
```
#### Get Book By isbn

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/isbn/080652121X
  http://localhost:8080/books/isbn/080652121X  
  
  Returned json
  ```
``` json
  {
	"id": 12,
	"isbn": "080652121X",
	"title": "Hitler's Secret Bankers: The Myth of Swiss Neutrality During the Holocaust",
	"author": "Adam Lebor",
	"yearOfPublication": 2000,
	"publisher": "Citadel Press",
	"imageUrlS": "http://images.amazon.com/images/P/080652121X.01.THUMBZZZ.jpg",
	"imageUrlM": "http://images.amazon.com/images/P/080652121X.01.MZZZZZZZ.jpg",
	"imageUrlL": "http://images.amazon.com/images/P/080652121X.01.LZZZZZZZ.jpg"
}
```
#### Get Book By title

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/title/africa
  http://localhost:8080/books/title/africa
  
  NOTE: query is not case sensitive
  
  Returned json
  ```
``` json
  [
	{
		"id": 435,
		"isbn": "8475960936",
		"title": "Les llengÃ¼es d'Africa (Biblioteca universal EmpÃºries)",
		"author": "M. Carme Junyent",
		"yearOfPublication": 1986,
		"publisher": "Editorial EmpÃºries",
		"imageUrlS": "http://images.amazon.com/images/P/8475960936.01.THUMBZZZ.jpg",
		"imageUrlM": "http://images.amazon.com/images/P/8475960936.01.MZZZZZZZ.jpg",
		"imageUrlL": "http://images.amazon.com/images/P/8475960936.01.LZZZZZZZ.jpg"
	},
	{
		"id": 743,
		"isbn": "0905762487",
		"title": "African Women: Their Struggle for Economic Independence",
		"author": "Christine Obbo",
		"yearOfPublication": 1980,
		"publisher": "Palgrave-Macmillan",
		"imageUrlS": "http://images.amazon.com/images/P/0905762487.01.THUMBZZZ.jpg",
		"imageUrlM": "http://images.amazon.com/images/P/0905762487.01.MZZZZZZZ.jpg",
		"imageUrlL": "http://images.amazon.com/images/P/0905762487.01.LZZZZZZZ.jpg"
	}
  ]
```
#### Get Book By author

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/author/Chinua Achebe
  http://localhost:8080/books/author/Chinua Achebe
  
  NOTE: query is not case sensitive
  
  Returned json
  ```
``` json  
  [
	{
		"id": 6756,
		"isbn": "0385474547",
		"title": "Things Fall Apart : A Novel",
		"author": "CHINUA ACHEBE",
		"yearOfPublication": 1994,
		"publisher": "Anchor",
		"imageUrlS": "http://images.amazon.com/images/P/0385474547.01.THUMBZZZ.jpg",
		"imageUrlM": "http://images.amazon.com/images/P/0385474547.01.MZZZZZZZ.jpg",
		"imageUrlL": "http://images.amazon.com/images/P/0385474547.01.LZZZZZZZ.jpg"
	},
	{
		"id": 41494,
		"isbn": "0449300234",
		"title": "No Longer at Ease",
		"author": "Chinua Achebe",
		"yearOfPublication": 1990,
		"publisher": "Fawcett Books",
		"imageUrlS": "http://images.amazon.com/images/P/0449300234.01.THUMBZZZ.jpg",
		"imageUrlM": "http://images.amazon.com/images/P/0449300234.01.MZZZZZZZ.jpg",
		"imageUrlL": "http://images.amazon.com/images/P/0449300234.01.LZZZZZZZ.jpg"
	}
]
```

#### Get Book By publisher

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/publisher/Onyx Books
  http://localhost:8080/books/isbn/publisher/Onyx Books
  
  Returned json
  ```
``` json
  [
    {
        "id": 126,
        "isbn": "0451406923",
        "title": "Goodbye, My Little Ones: The True Story of a Murderous Mother and Five Innocent Victims",
        "author": "Charles Hickey",
        "yearOfPublication": 1996,
        "publisher": "Onyx Books",
        "imageUrlS": "http://images.amazon.com/images/P/0451406923.01.THUMBZZZ.jpg",
        "imageUrlM": "http://images.amazon.com/images/P/0451406923.01.MZZZZZZZ.jpg",
        "imageUrlL": "http://images.amazon.com/images/P/0451406923.01.LZZZZZZZ.jpg"
    },
    {
        "id": 145,
        "isbn": "0451410319",
        "title": "Hush",
        "author": "Anne Frasier",
        "yearOfPublication": 2002,
        "publisher": "Onyx Books",
        "imageUrlS": "http://images.amazon.com/images/P/0451410319.01.THUMBZZZ.jpg",
        "imageUrlM": "http://images.amazon.com/images/P/0451410319.01.MZZZZZZZ.jpg",
        "imageUrlL": "http://images.amazon.com/images/P/0451410319.01.LZZZZZZZ.jpg"
    }
 ]
```
#### Get Book By year of publication

``` 
  Request type: GET 
  
  https://amazonbooksapi.onrender.com/books/year_of_publication/2002
  http://localhost:8080/books/isbn/year_of_publication/2002
  
  Returned json
  ```
``` json
  [
    {
        "id": 12,
        "isbn": "080652121X",
        "title": "Hitler's Secret Bankers: The Myth of Swiss Neutrality During the Holocaust",
        "author": "Adam Lebor",
        "yearOfPublication": 2000,
        "publisher": "Citadel Press",
        "imageUrlS": "http://images.amazon.com/images/P/080652121X.01.THUMBZZZ.jpg",
        "imageUrlM": "http://images.amazon.com/images/P/080652121X.01.MZZZZZZZ.jpg",
        "imageUrlL": "http://images.amazon.com/images/P/080652121X.01.LZZZZZZZ.jpg"
    },
    {
        "id": 145,
        "isbn": "0451410319",
        "title": "Hush",
        "author": "Anne Frasier",
        "yearOfPublication": 2002,
        "publisher": "Onyx Books",
        "imageUrlS": "http://images.amazon.com/images/P/0451410319.01.THUMBZZZ.jpg",
        "imageUrlM": "http://images.amazon.com/images/P/0451410319.01.MZZZZZZZ.jpg",
        "imageUrlL": "http://images.amazon.com/images/P/0451410319.01.LZZZZZZZ.jpg"
    }
 ]
```