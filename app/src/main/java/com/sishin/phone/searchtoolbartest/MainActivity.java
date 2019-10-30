package com.sishin.phone.searchtoolbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private NoticeContent mNoticeContent = null;
    private Context mContext = null;
    private Button mTestBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mNoticeContent = new NoticeContent();
        mNoticeContent.getNoticeList().add(new NoticeItem("친구는 세월의 도둑이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("봄부터 흐르는 물은 겨울이 되어도 얼지 않듯이"));
        mNoticeContent.getNoticeList().add(new NoticeItem("마음에서 우러나오는 우적은 역경이 닥친다고 해서 식지 않는다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("불행했을 때 만난 친구는 가장 소중히 여겨야 한다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("행복했을 때 함께 기쁨을 누리는 친구보다"));
        mNoticeContent.getNoticeList().add(new NoticeItem("힘들 떄 슬픔을 덜어지는 친구를 더 많이 신뢰할 수 있다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("부유했을 때는 친구를 사귀기 쉽지만,"));
        mNoticeContent.getNoticeList().add(new NoticeItem("어려울 때는 눈을 씻고 찾아봐도 친구를 찾기 어렵다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("누군가 진정한 우정을 나누고 있다 할지라도 그 우정을 지키려면 오랜 시간이 걸린다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("짧은 시간 안에 많은 친구를 얻기란 불가능하다. 왜냐하면"));
        mNoticeContent.getNoticeList().add(new NoticeItem("그들은 진정한 친구가 아니기 때문이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("친구란 말하자면 또 하나의 자신이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("친구를 보면 그 사람을 알 수 있다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("현명한 사람과 어리석은 사람은 서로 어울리지 않는다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("친구는 나를 동정하는 자가 아니라 나를 돕는 자다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("서로가 고통을 덜어 주지 않는다면 우리는 무엇을 위해 사는 것일까?"));
        mNoticeContent.getNoticeList().add(new NoticeItem("우리는 모두 적막한 세계를 떠도는 나그네다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("그 여정에서 찾을 수 있는 최고의 선물은 바로 믿음직한 벗이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("좋은 벗은 충격을 덜어주는 완충장치와도 같은 것이며"));
        mNoticeContent.getNoticeList().add(new NoticeItem("인생의 길에서 충동을 피할 수 있도록 도와준다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("우정만이 세상을 하나로 만들 수 있다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("우정은 영혼의 결혼이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("간담상조(肝膽相照) 간과 쓸개를 드러내 보인다는 절친한 사이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("관포지교(管鮑之交) 관숙과 포숙아의 사귐,"));
        mNoticeContent.getNoticeList().add(new NoticeItem("변함없는 돈독한 우정."));
        mNoticeContent.getNoticeList().add(new NoticeItem("막역지우(莫逆之友) 마음에 거슬리는 것이 없는 친구,"));
        mNoticeContent.getNoticeList().add(new NoticeItem("더할 나위 없이 친한 친구"));
        mNoticeContent.getNoticeList().add(new NoticeItem("문경지교(刎頸之交) 목을 베어줄 정도의 우정, 변함없는 우정"));
        mNoticeContent.getNoticeList().add(new NoticeItem("참된 사랑이 아무리 드물다 해도 참된 우정만큼 드문 것은 아니다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("참된 우정은 건강과 같아서 그것을 잃어버려야만 그 가치가 드러난다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("사랑에는 신뢰가 우정에는 이해가 필요하다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("사랑은 두마음이 한 몸이 되는 것이고,"));
        mNoticeContent.getNoticeList().add(new NoticeItem("우정은 두 몸이 한 몸이 되는 것이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("우정은 신들의 선물이며 사람에게 소중한 행운이다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("여자가 개입되면 우정이 끝나는 것은 시간문제다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("여자의 우정은 언제나 사랑으로 끝난다."));
        mNoticeContent.getNoticeList().add(new NoticeItem("아름다운 우정은 날개 없는 사랑의 신이다"));
        mNoticeContent.getNoticeList().add(new NoticeItem("[출처] 좋은 긴글 모음(우정,용서,침묵,충고) |작성자 평화둥이"));

        mTestBtn = (Button) findViewById(R.id.test_btn);
        mTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SearchActivity.class);
                intent.putExtra(NoticeContent.NOTICE_CONTENT, mNoticeContent);
                startActivity(intent);

            }
        });
    }
}
