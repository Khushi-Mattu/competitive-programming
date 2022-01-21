/*


The game of tetris involves blocks of various colours dropping on top of each other If four blocks of the same colour are stacked on top of each other then they disappear, otherwise the height of the tower keeps on growing. You will be given two queries:

Type 1: Add a block of given colour on the tetris stack.

Type 2: Tell the current height of the tetris stack.

 

Input Format:

The first line of the input contains a single positive integer Q, which is the number of queries.

Then Q lines follow, each containing either of the two types of query:

Type 1 query format: 1 <colour>, Two space separated values, colour is a string of length not more than 20

Type 2 query format: 2

 

Example

 

Sample Input:

10

1 Green

1 Red

1 Red

2

1 Green

1 Green

2

1 Green

1 Green

2

Sample Output:

3

5

3

Explanation:

First we get

1 Green

1 Red

1 Red

We have 3 boxes stacked on top of each other and now we are asked the height, its 3.

Moving on, we stack two more green boxes and again we are asked the height. At this point, the height is 3 + 2 = 5

Now again two type 1 queries adding the green boxes to the tetris tower and now height is asked. Since 4 continuous green colored boxes are stacked on top of each other, they disappear and the height again becomes 3.
*/




//I got pvt test cases failed
#include<iostream>
#include<vector>
#include<string>
using namespace std;
int main()
{
    int i=0;int q;
    cin>>q;
    vector<string> color;
    
    int cnt;
    while(i<q){
        int size=color.size();
        int type;
        cin>>type;
        //cout<<type;
        string col;
        if(type==1){
            cin>>col;
            //cout<<col<<endl;;
            color.push_back(col);
        }
        else if(type==2){
            //cout<<"hi \n";
            //cout<<count(color)<<endl;
            if(color.size()<4){
                cnt= color.size();
            }
            else{
                if(color[size-1]==color[size-2]){
                
                if( color[size-2]==color[size-3]){
                    if( color[size-3]==color[size-4]){
                        color.pop_back();
                        color.pop_back();
                        color.pop_back();
                        color.pop_back();
                        cnt= color.size();
                        size=color.size();
                    }
                    else{
                        cnt= color.size();
                    }
                }
                else{
                    cnt= color.size();
                }
            }
            else{
                cnt= color.size();
            }
            }
            cout<<cnt<<endl;
        }
        i++;
    }
    //for(int j=0;j<color.size();j++){
      //          cout<<"\n"<<color[j];
}