//Weekly Contest 304
//2358. Maximum Number of Groups Entering a Competition
int n=grades.length;
    int c=1;int p=0;
    while(n>=c){
       n-=c;
        p++;
        c+=1;
    }
    return p

