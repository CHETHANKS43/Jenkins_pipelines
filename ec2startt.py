import boto3

def start_instances(instance_ids, region):
    ec2 = boto3.client('ec2', region_name=region)
    ec2.start_instances(InstanceIds=instance_ids)
    print(f"Started instances: {instance_ids}")

if __name__ == "__main__":
    instance_ids = ['i-0123456789abcdef0']  # Replace with your instance IDs
    region = 'ap-south-1'  # Replace with your desired region
    start_instances(instance_ids, region)
