package com.porject.myblog.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; //


@Entity //클래스가 DB테이블과 1:1로 매핑되는 JPA 엔티티임을 의미
@Table(name = "posts") //테이블 이름 정의 (생략가능)
@Data //getter / setter 등 자동 생성 lombok
@NoArgsConstructor //기본 생성자 자동 생성
@Builder //빌더 패턴 자동 생성 


public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 값을 DB애서 자동으로 생성하도록 저장
    private Long id;

    @NotNull
    @Column(nullable = false, length = 100) //해당 필드를 DB 테이블의 컬럼과 매핑합니다
    private String title;

    @NotNull
    @Column(nullable = false)
    private String content;

    @Transient
    private String temField;
}
