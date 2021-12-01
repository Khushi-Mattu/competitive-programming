#include<iostream>
#include<fstream>
using namespace std;
int main()
{
    int num;

    char nameoffile[100];
    
    cin>>nameoffile;
    
    ofstream Myfile("nameoffile.txt");
    cin>>num;
    int name[100],date[100],month[100],year[100];
    for(int i=0;i<num;i++){
        cin>>name[i];
        cin>>date[i];
        cin>>month[i];
        cin>>year[i];
    }
    for(int i=0;i<num;i++){
        if (date[i]>date[i+1]){
            cout<<"available";
        }
    }

}