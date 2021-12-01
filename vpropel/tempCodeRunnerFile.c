i==num_recvd){
                printf("right %d",i);
                break;
            }
            else if(n<<i==num_recvd){
                printf("left %d",i);
                break;
            }
            else{
                i++;
            }
        }