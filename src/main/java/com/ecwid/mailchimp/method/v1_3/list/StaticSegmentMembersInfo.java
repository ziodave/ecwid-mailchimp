package com.ecwid.mailchimp.method.v1_3.list;

import com.ecwid.mailchimp.MailChimpObject;

import java.util.Date;
import java.util.List;

/**
 *
 */
public class StaticSegmentMembersInfo extends MailChimpObject
{
    @Field
    public Integer success;

    @Field
    public List<StaticSegmentMembersAddErrors> errors;
}
