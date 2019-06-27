package quickrvisit.hexlog.admin.demonew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DemoSeconD extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i,j,n=5;

        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
//                System.out.print("*");
                System.out.print(i);
            }
            System.out.println("");
        }


        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++)
            {

                if(i%1==0){
                    System.out.print(i);
                }else{
                    System.out.print(i);
                }
                // System.out.print(i);

            }
            System.out.println("");
        }

    }


}

