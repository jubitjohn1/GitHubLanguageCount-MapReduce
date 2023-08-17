# GitHubLanguageCount-MapReduce
This application pulls repo data from github using GitHub Api, Map reduce alogithrm used herecan effectively calculate the number of times each language is used 
in an GitHub account.

API USED : https://docs.github.com/en/rest/quickstart?apiVersion=2022-11-28

Command to run Hadoop : Hadoop jar target/sample-1.0-SNAPSHOT.jar com.mr.GitHubRepoCounter [Input File PATH] [Output File]

# Demo
For the demo purpose I have pulled all repo name and it's primary language from Microsoft GitHub account, you can choose any account, please make sure to specify the account username in the Api Fetch code.
