# GraphQLDemo
### GraphQL with Spring

<br/>
<br/>

Why GraphQL? 
- When same API is used by different clients it gives same output for every client in case of REST. But instead if a particular client need some different kind of output using the same API (e.g. An API is producing response with 3 parameters, one client says I don't need the first parameter, only the last 2 needed), in that case GraphQL is used. By changing the output parameters in query we allow multiple clients using same API get different outputs, as per their requirements.

<br/>
<br/>

findAll: input: `NA` output: `List<Player>` 
<br/>
<br/>
<img width="901" alt="Screenshot 2025-02-12 at 6 08 38 PM" src="https://github.com/user-attachments/assets/baebfdf0-1a52-4d38-a536-b5820ba4542c" />

<br/>
<br/>

findOne: input: `id` output: `Optional<Player>`
<br/>
<br/>
![image](https://github.com/user-attachments/assets/b63bd51e-05bd-48b0-8ea1-228a0de2ba9d)

<br/>
<br/>
GraphQL Dashboard
<br/>
<br/>
![image](https://github.com/user-attachments/assets/b37e8c01-c6a7-4e69-8da5-8d261ba7bf91)


