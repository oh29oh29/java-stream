## Java stream

- 데이터 처리 연산을 지원하도록 소스에서 추출된 연속된 요소(Sequence of elements)

1. 연속된 요소
> collection 과 동일하게 특정 요소 형식으로 이루어진 연속된 값 집합의 인터페이스를 제공한다.  
> collection 은 자료구조이므로 주제는 데이터이지만, stream 은 계산한다.

2. 소스
> collection, array, I/O 자원 등의 데이터 제공 소스로부터 데이터를 소비한다.

3. 데이터 처리 연산
> 함수형 프로그래밍 언어에서 일반적으로 지원하는 연산과 데이터베이스와 비슷한 연산을 지원한다.  
> filter, map, reduce, find, match, sort 등으로 데이터를 조작한다.
> stream 연산은 순차적으로 또는 병렬로 실행한다.

4. 파이프라이팅 (pipelining)
> stream 연산끼리 연결해서 커다란 파이프라인을 구성할 수 있도록 stream 자신을 반환한다.
> 덕분에 게으름 laziness, 쇼트서킷 short-circuiting 같은 최적화도 얻을 수 있다.

5. 내부 반복
> 반복자를 이용해서 명시적으로 반복하는 collection 과 달리 stream 은 내부 반복을 지원한다.