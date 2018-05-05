def solution(S,K):
    l = len(S)
    if l==1 :
        return 0
    

    first_L= S.find('L')
    # print(first_L)
    if first_L==-1:
        num_M = l;
        if num_M != K:
            if num_M>=K:
                print("num_M >= K")
                print("S >>>>>>>" + S)
                change_times = round(num_M/(K+1))
                print(change_times)
                return change_times
            else:
                if S!= '':
                    print("num_M < K")
                    print("S >>>>>>>" + S)
                    change_times=abs(num_M-K)
                else:
                    change_times=0                    
                return change_times
                
    else:
        # print(S[:first_L])
        print("else ========")
        print("String >>>>>>>" + S)
        return solution(S[:first_L], K)+ solution(S[first_L+1:], K)
        # print(S[first_L+1:])
        

print("soluntion is >>>>>>>> "+ str(solution('MLMMMLMMMM', 2)))